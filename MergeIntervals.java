package Leetcode;

import java.util.*;

class Interval {
	int start;
	int end;
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
}

class IntervalComparator implements Comparator
{
    public int compare(Object o1, Object o2)
    {
        Interval i1 = (Interval)o1;
        Interval i2 = (Interval)o2;
        return i1.start - i2.start;
    }
}

public class MergeIntervals {

	public static void main(String[] args) {
		Interval i1=new Interval(1,3);
		Interval i2=new Interval(2,6);
		Interval i4=new Interval(8,10);
		Interval i3=new Interval(15,18);
		Interval inull=new Interval();
		List<Interval> inp=new ArrayList<>();
		inp.add(i1);
		inp.add(i2);
		inp.add(i3);
		inp.add(i4);
		//inp.add(inull);
		
		MergeIntervals m =new MergeIntervals();
		for(Interval i:inp){
			System.out.print("["+i.start+","+i.end+"] ");
		}
		System.out.println();
		inp= m.merge(inp);
		for(Interval i:inp){
			System.out.print("["+i.start+","+i.end+"] ");
		}


	}
	public List<Interval> merge(List<Interval> intervals) {
		if(intervals.size()==0){
			return null;
		}
		
		List<Interval> res=new ArrayList<>();
		Collections.sort(intervals, new IntervalComparator());
		System.out.println("SOrting");
		for(Interval i:intervals){
			System.out.print("["+i.start+","+i.end+"] ");
		}
		System.out.println();
		System.out.println("Result");
		
		int end =intervals.get(0).end;
		int start=intervals.get(0).start;
		for(Interval i:intervals){
			if(i.start<end){
				 if(i.end>end){
	                    end=i.end;
	                }
			}else{
				res.add(new Interval(start,end));
				start=i.start;
				end=i.end;
			}
		}
		res.add(new Interval(start,end));
		return res;
	}

}
