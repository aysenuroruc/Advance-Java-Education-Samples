package tr.com.netas.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;

public class CountingTask extends RecursiveTask<Integer> {
	 
    private final TreeNode node;
 
    public CountingTask(TreeNode node) {
        this.node = node;
    }
    
    @Override
    protected Integer compute() {
    	
    	 int total = node.value ;
       try 
       {
    	  
	    	List<ForkJoinTask<Integer>> altThreadler = new ArrayList<>();
	    	for(TreeNode childNode : this.node.children)
	    	{
	    	   ForkJoinTask<Integer>  task =	new CountingTask(childNode).fork();
	    	   altThreadler.add(task);
	    	}
	    	
	    	
    	
	    	for(ForkJoinTask<Integer> t : altThreadler)
	    	{
	    		 total += t.join();
	    	}
	    	
       }catch (Exception e) {
		e.printStackTrace();
	}
       return total;
       /*
    	return node.value + node.children.stream()
          .map(childNode -> new CountingTask(childNode).fork())
          .collect(Collectors.summingInt(ForkJoinTask::join));
         */
          
    }
}