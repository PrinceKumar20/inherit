package InheritedClasses;

public class Inherit {
	public interface Parent1{
		int i=2;
	}
	public interface Parent2{
		int j = 3;
	}
	public interface Parent3{
		int k = 4;
	}

	public static void main(String[] args) {
		
		class test implements Parent1, Parent2{
			
		}

	}

}
