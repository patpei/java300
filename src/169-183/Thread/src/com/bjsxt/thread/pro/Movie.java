package com.bjsxt.thread.pro;
/**
 一个场景,共同的资源
  生产者消费者模式 信号灯法
 wait() :等待，释放锁   sleep 不释放锁
 notify()/notifyAll():唤醒
  与 synchronized
 * @author Administrator
 *
 */
public class Movie {
	private String pic ;
	//信号灯
	//flag -->T 生产生产，消费者等待 ，生产完成后通知消费
	//flag -->F 消费者消费 生产者等待, 消费完成后通知生产
	private boolean toWork =true;
	/**
	 * 播放
	 * @param pic
	 */
	public synchronized  void play(String pic){
		System.out.println("in "+Thread.currentThread().getName()+" toWork= "+toWork);
		if(!toWork){ //生产者等待
			
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//开始生产
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 生产了:"+pic);
		//生产完毕		
		this.pic =pic;
				//生产者停下
				this.toWork =false;
		//通知消费
		this.notify();
		
	}
	
	public synchronized void watch(){
		System.out.println("in "+Thread.currentThread().getName()+" toWork= "+toWork);
		if(toWork){ //消费者等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//开始消费
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 消费了"+pic);
		//消费完毕
			//消费停止
				this.toWork=true;
		//通知生产
		this.notifyAll();
		
	}
}
