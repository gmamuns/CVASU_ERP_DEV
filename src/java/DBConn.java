
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;


public class DBConn {

    public static void main(String[] args) throws UnknownHostException {
		MongoClient client = new MongoClient();
		DB db = client.getDB("mamuns");
		DBCollection coll = db.getCollection("mamuns");

		BasicDBObject doc = new BasicDBObject("name", "jane")
		        .append("type", "database")
		        .append("count", 1)
		        .append("info", new BasicDBObject("x", 203).append("y", 102));
                
		//coll.insert(doc);
		System.out.println(doc.toString());
	}
    
    
}
