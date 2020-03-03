//每次插入元素时，若第一个栈内已经有元素，应将已有的全部元素依次弹出并压入第二个栈
//然后将新元素压入第一个栈,最后将第二个栈内的全部元素依次弹出并压入第一个栈。
class CQueue {
LinkedList<Integer> s1,s2;
	public CQueue(){
		s1 = new LinkedList<>();
		s2 = new LinkedList<>();
	}
	public void appendTail(int value) {
		s1.addLast(value);
	}
	public int deleteHead() {
		if(!s2.isEmpty()) return s2.removeLast();
        if(s1.isEmpty())  return -1;
		while(!s1.isEmpty()){
			s2.addLast(s1.removeLast());
		}
		return s2.removeLast();
	}
}


/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
