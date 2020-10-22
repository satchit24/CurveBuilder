package processing;
import java.security.Timestamp;
import java.util.*;
import processing.utility.*;

/**
*
* @author Satchit Desai
*/

public class CurveBuilder {
	public static BoardObject drawCurve(ArrayList<Pixel> pixels, BoardObjectOperation newboardOp,
			ObjectId newobjectId, Timestamp newtimestamp, UserId newuserId,
			ArrayList<Pixel> prevPixelIntensities, Boolean isReset) {
		
		Iterator<Pixel> itr = pixels.iterator();

		while(itr.hasNext()) {
			
			Pixel temp_pixel = (Pixel) itr.next();
			
			Intensity temp_intensity = temp_pixel.Intensity;
			
			Position temp_position = temp_pixel.Position;
			
			if(temp_intensity.r < 0) {
				temp_intensity.r = 0;
			}	else if(temp_intensity.r > 255) {
				temp_intensity.r = 255;
			}
			
			if(temp_intensity.g < 0) {
				temp_intensity.g = 0;
			}	else if(temp_intensity.g > 255) {
				temp_intensity.g = 255;
			}
			
			if(temp_intensity.b < 0) {
				temp_intensity.b = 0;
			}	else if(temp_intensity.b > 255) {
				temp_intensity.b = 255;
			}
		}
		
		BoardObject curveObj = new BoardObject();
		curveObj.pixels = pixels;
		
		curveObj.objectid = new ObjectId();
		curveObj.objectid = newobjectId;
		
		curveObj.timestamp = new Timestamp();
		curveObj.timestamp = newtimestamp;
		
		curveObj.userid = new UserId();
		curveObj.userid = newuserId;
		
		//Map<Postion, Priority Queue<Pair<ObjectId,Timestamp>>(0, new ObjectComparator()> pixelToPQ;
		//
		Iterator<Pixel> itr2 = pixels.iterator();
		
		while(itr.hasNext()) {
			Pixel temp_pixel = (Pixel) itr2.next();
			pixelToPQ.put(temp_pixel.Position, PriorityQueue<Pair<newobjectId, newtimestamp> >
			(0, new ObjectComparator);
		}
		//Map<ObjectId, BoardObject> objIdToBoardObject;
		objIdToBoardObject.put(newobjectId,curveObj);
		
		//Map<UserId,String> idToName;
		String username = new getUsername();
		idToName.put(curveObj.userid, username);
		
		//added objects to shruti's maps
		
		pushIntoStack(BoardObject curveObj);
		//pushed to rakesh's stacks
		return curveObj;
	}
}