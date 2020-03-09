package Observable;

public class Follower {

	private String followerName;
	public TwitterUser twitterUser=new TwitterUser();
	
	public Follower(String followerName) {
		super();
		this.followerName = followerName;
	}

	public void update()
	{
		
		System.out.println("Hey!  "+followerName  +" new Tweet is uploaded as"+twitterUser.title);
	}
	
	public void followUser(TwitterUser fname)
	{
		
	   twitterUser=fname;
	}
	
}
