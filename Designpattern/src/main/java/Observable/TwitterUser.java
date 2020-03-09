package Observable;

import java.util.ArrayList;
import java.util.List;

public class TwitterUser {

	
	private List<Follower> follower=new ArrayList<>();
	String title;
	
	public void Follow(Follower fname)
	{
		
		follower.add(fname);
		
	}

public void unFollow(Follower fname)
{
	follower.remove(fname);
}

public void notifyFollowers()
{
	for(Follower fname:follower)
	{
		
		fname.update();
	}

}
public void update(String title)
{
this.title=title;
notifyFollowers();


}

}


