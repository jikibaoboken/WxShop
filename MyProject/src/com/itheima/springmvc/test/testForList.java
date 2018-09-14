package com.itheima.springmvc.test;

import java.util.ArrayList;
import java.util.List;

class InfoList
{
	private List<Info> list = new ArrayList<Info>();

	public List<Info> getList() {
		return list;
	}

	@Override
	public String toString() {
		return "InfoList [list=" + list + "]";
	}

	public void setList(List<Info> list) {
		this.list = list;
	}
	
}
public class testForList {
	public static void main(String args[])
	{
		Info info1 = new Info(1,"jack");
		Info info2 = new Info(2,"green");
		InfoList list = new InfoList();
		list.getList().add(info1);
		System.out.print(list);
	}

}
