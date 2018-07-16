//Job class will be used to represent the jobs available
public class Job implements Comparable{
	public String jobName;
	public int arrivalTime;
	public int burstTime;
	public Job(){
		jobName = "";
		arrivalTime = 0;
		burstTime = 0;
	}
	public Job(String name, int t1, int t2){
		jobName = name;
		arrivalTime = t1;
		burstTime = t2;
	}
	public Job(Job someJob){
		this.jobName = someJob.jobName;
		this.arrivalTime = someJob.arrivalTime;
		this.burstTime = someJob.burstTime;
	}
	//overriding Comparable method for sorting
	public int compareTo(Job anotherJob){
		return this.burstTime - anotherJob.burstTime;
	}
}
