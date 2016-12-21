package fcu.iecs.oop.pokemon;

public class Pokemon 
{
	private String name ;
	private PokemonType type ;
	private int cp ;
	
	public Pokemon(String name,PokemonType type,int cp)
	{
		this.name = name ;
		this.type = type ;
		this.cp = cp ;
	}
	
	public String get_Name()
	{
		return name ;
	}
	
	public PokemonType get_PokemonType()
	{
		return type ;
	}
	
	public void set_cp(int cp)
	{
		this.cp = cp ;
	}
	
	public int get_cp()
	{
		return cp ;
	}
	
	public void attack() 
	{
	}
}