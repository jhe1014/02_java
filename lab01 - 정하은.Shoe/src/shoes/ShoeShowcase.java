package shoes;

import java.util.List;

import shoe.Shoe;

public interface ShoeShowcase {
	
	public abstract int add (Shoe shoe);
	
	public abstract int set (Shoe shoe);
	
	public abstract int remove(Shoe shoe);

	public abstract Shoe get(Shoe shoe);
	
	public abstract List<Shoe> getAllShoes();
}
