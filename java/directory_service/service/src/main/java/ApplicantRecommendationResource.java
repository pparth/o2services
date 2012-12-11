import ApplicantRecommendation;
import Insert_args;
import getAll_result;
import com.yammer.metrics.annotation.Timed;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TMemoryBuffer;
import org.apache.thrift.transport.TTransportException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.*;

@Path("/applicantrecommendations")
@Produces(MediaType.APPLICATION_OCTET_STREAM)
public class ApplicantRecommendationResource {


    public ApplicantRecommendationResource() {

    }

    @GET
    @Timed
    public Response GetAll() {

        List<ApplicantRecommendation> recommendations = new ArrayList<ApplicantRecommendation>();

        ApplicantRecommendation applicantRecommendation = new ApplicantRecommendation();
        applicantRecommendation.setApplicationId(1234);
        applicantRecommendation.setAlgorithm("BEST_ALGORITHM");
        applicantRecommendation.setAnnotation(1);
        applicantRecommendation.setScore(1234.56);

        recommendations.add(applicantRecommendation);
        applicantRecommendation = new ApplicantRecommendation();
        applicantRecommendation.setApplicationId(5678);
        applicantRecommendation.setAlgorithm("BEST_ALGORITHM");
        applicantRecommendation.setAnnotation(2);
        applicantRecommendation.setScore(6789.01);

        recommendations.add(applicantRecommendation);

        if (recommendations.size() == 0) return Response.status(Response.Status.NO_CONTENT).build();
        getAll_result result = new getAll_result(recommendations);
        TMemoryBuffer memoryBuffer = new TMemoryBuffer(1);
        // COMMENTED CODE FOR JSON PROTOCOL
        /*try {
            result.write(new TJSONProtocol(memoryBuffer));
            memoryBuffer.flush();
        } catch (TException e) {
            e.printStackTrace();
        }

        // byte[] resultByte = memoryBuffer.
        try {
            return memoryBuffer.toString("UTF-8").getBytes();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return new byte[0];*/

        try {
            result.write(new TBinaryProtocol(memoryBuffer));
            memoryBuffer.flush();
        } catch (TException e) {
            e.printStackTrace();
        }

        return Response.status(Response.Status.OK).entity(memoryBuffer.getArray()).build();
    }

    @POST
    @Timed
    public Response Insert(byte[] applicantRecommendationBinary) {
        TMemoryBuffer memoryBuffer = new TMemoryBuffer(1);
        try {
            memoryBuffer.write(applicantRecommendationBinary);
        } catch (TTransportException e) {
            e.printStackTrace();
        }
        Insert_args args = new Insert_args();
        try {
            args.read(new TBinaryProtocol(memoryBuffer));
        } catch (TException e) {
            e.printStackTrace();
        }
        ApplicantRecommendation applicantRecommendation = args.getApplicantRecommendation();
        String str = applicantRecommendation.toString();
        if(str.length() > 0) return Response.status(Response.Status.CREATED).build();
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
    }
}
