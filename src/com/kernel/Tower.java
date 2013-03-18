package com.kernel;

public class Tower {
	private float range;
	private float attackSpeed;
	private int level;
	private float damage;
	private float price;
	
	public void shoot()
	{
		//TODO: LLamar a metodos del engine
	}
	public void rotateCannon()
	{
		//TODO
	}
	public float calculateDamage(Hero hero)
	{
		//TODO
		return attackSpeed;	
	}
	public void improveTower()
	{
		//TODO
	}
	public Enemy target()
	{
		return null;	
	}
	public float getRange() {
		return range;
	}
	public void setRange(float range) {
		this.range = range;
	}
	public float getAttackSpeed() {
		return attackSpeed;
	}
	public void setAttackSpeed(float attackSpeed) {
		this.attackSpeed = attackSpeed;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public float getDamage() {
		return damage;
	}
	public void setDamage(float damage) {
		this.damage = damage;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
