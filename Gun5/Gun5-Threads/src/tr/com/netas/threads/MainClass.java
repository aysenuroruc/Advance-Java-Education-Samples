package tr.com.netas.threads;

import java.util.HashSet;
import java.util.concurrent.ForkJoinPool;

public class MainClass {

	public static void main(String[] args) {

			
		TreeNode tree = new TreeNode(10, 
				new TreeNode(20, new TreeNode(1),new TreeNode(2)),
				new TreeNode(30, new TreeNode(8),new TreeNode(9))
				);
		
		ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
		int sum = forkJoinPool.invoke(new CountingTask(tree));
		System.out.println(sum);
		
		
		

	}

}
