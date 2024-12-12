package com.igr.dsa.doubly.obj;

public class NodeDL {
	private Object data;
	private NodeDL next;
	private NodeDL prev;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public NodeDL getNext() {
		return next;
	}

	public void setNext(NodeDL next) {
		this.next = next;
	}

	public NodeDL getPrev() {
		return prev;
	}

	public void setPrev(NodeDL prev) {
		this.prev = prev;
	}

}
