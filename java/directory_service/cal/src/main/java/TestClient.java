import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.*;

import java.io.InputStream;
import java.util.*;



public class TestClient
{
    public static void main(String [] args) throws Exception {
        HttpClient httpclient = new DefaultHttpClient();
        String baseURL = "http://localhost:8050";
        if(args.length == 1)
        {
            baseURL = args[0];
        }
        try {

            HttpGet httpget = new HttpGet(baseURL + "/applicantrecommendations");

            System.out.println("executing GET request " + httpget.getURI());

            // Create a response handler
            /*ResponseHandler<String> responseHandler = new BasicResponseHandler();
            String responseBody = httpclient.execute(httpget, responseHandler);
            TMemoryBuffer memoryBuffer = new TMemoryBuffer(1);
            memoryBuffer.write(responseBody.getBytes());
            getAll_result result = new getAll_result();
            result.read(new TJSONProtocol(memoryBuffer));*/

            HttpResponse response = httpclient.execute(httpget);
            HttpEntity content = response.getEntity();
            InputStream data = content.getContent();
            TMemoryBuffer memoryBuffer = new TMemoryBuffer(1);
            byte[] dataBytes = new byte[(int) content.getContentLength()];
            data.read(dataBytes);
            memoryBuffer.write(dataBytes);
            getAll_result result = new getAll_result();
            result.read(new TBinaryProtocol(memoryBuffer));
            List<ApplicantRecommendation> applicantRecommendations = result.getSuccess();
            for (ApplicantRecommendation applicantRecommendation : applicantRecommendations)
            {
                System.out.println(applicantRecommendation.toString());
            }
            data.close();

            HttpPost httpPost = new HttpPost(baseURL + "/applicantrecommendations");
            System.out.println("executing POST request " + httpPost.getURI() + " using one of the previously returned Applicant Recommendation objects as payload");

            memoryBuffer = new TMemoryBuffer(1);
            Insert_args arguments = new Insert_args(applicantRecommendations.get(0));
            arguments.write(new TBinaryProtocol(memoryBuffer));
            memoryBuffer.flush();
            httpPost.setEntity(new ByteArrayEntity(memoryBuffer.getArray()));
            response = httpclient.execute(httpPost);
            System.out.println("Service returned status: " + response.getStatusLine().getStatusCode());

        } finally {
            // When HttpClient instance is no longer needed,
            // shut down the connection manager to ensure
            // immediate deallocation of all system resources
            httpclient.getConnectionManager().shutdown();
        }






    }




}
