package caozuo1;

import java.util.concurrent.Semaphore;

public class ThirdRunThread extends Thread{
    String content;
    Semaphore sem1,sem2,sem3;
	public  ThirdRunThread(Semaphore sem1,Semaphore sem2,Semaphore sem3,String content)
	{
		
		this.sem1=sem1;
		this.sem2=sem2;
		this.sem3=sem3;
		this.content=content;
	}
	public void run()
	{    
		try {
			sem1.acquire();
			sem2.acquire();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   try {
			   Thread.sleep(2*1000);
			   
		   }catch(InterruptedException ex)
		   {
			   
		   }
		 FrameMain.jta6.setText(content);
	
	   
		sem1.release();
		sem2.release();
		
	}
}