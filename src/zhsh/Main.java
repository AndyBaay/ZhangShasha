package zhsh;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		// Sample trees (in preorder).
		String tree1Str1 = "f(d(a c(b)) e)";
		String tree1Str2 = "f(c(d(a b)) e)";
		// Distance: 2 (main example used in the Zhang-Shasha paper)

		String tree1Str3 = "a(b(c d) e(f g(i)))";
		String tree1Str4 = "a(b(c d) e(f g(h)))";
		// Distance: 1

		String tree1Str5 = "a(b c)";
		String tree1Str6 = "g(b h)";
		// Distance: 2

		Tree tree1 = new Tree(tree1Str1);
		Tree tree2 = new Tree(tree1Str2);

		Tree tree3 = new Tree(tree1Str3);
		Tree tree4 = new Tree(tree1Str4);

		Tree tree5 = new Tree(tree1Str5);
		Tree tree6 = new Tree(tree1Str6);

		//int distance1 = Tree.ZhangShasha(tree1, tree2);
		//System.out.println("Expected 2; got " + distance1);
		
		//System.out.println(tree1.labels);

		//int distance2 = Tree.ZhangShasha(tree3, tree4);
		//System.out.println("Expected 1; got " + distance2);

		//int distance3 = Tree.ZhangShasha(tree5, tree6);
		//System.out.println("Expected 2; got " + distance3);
		
		//// PARALLEL STUFF ////
		
		TreeParallel ptree1 = new TreeParallel(tree1Str5);
		TreeParallel ptree2 = new TreeParallel(tree1Str6);
		
		int pdistance1 = TreeParallel.ZhangShasha(ptree1, ptree2);
		System.out.println("Expected 2; got " + pdistance1);
		
	}
}
