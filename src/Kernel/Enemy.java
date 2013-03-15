package Kernel;

public class Enemy {
	private String type;
	private float speed;
	private long hp;
	private String sprite;
	private int x,y;
	
	public void Slow(float slow)
	{
		this.speed = this.speed * slow;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public long getHp() {
		return hp;
	}
	public void setHp(long hp) {
		this.hp = hp;
	}
	public String getSprite() {
		return sprite;
	}
	public void setSprite(String sprite) {
		this.sprite = sprite;
	}
	private void move(int x, int y)
	{
		
	}
	private void rotation()
	{
		
	}
	
}
