package com.example.beans;
/*
 * 定义一个抽象数据类型，将离散的数据整合起来
 * 用来暂时存储数据
 */
public class Cuns {
 private String title;//标题
 private String content;//内容
 private String times;//时间
 private int ids;//编号
 //在构造器中，封装相关的操作
 public Cuns(String ti,int id,String con ,String time){
	 this.ids=id;
	 this.title=ti;
	 this.content=con;
	 this.times=time;
 }
 public Cuns(String ti,String con,String time){
	 this.title=ti;
	 this.content=con;
	 this.times=time;
 }
 public Cuns(int i,String ti,String time){
	 this.ids=i;
	 this.title=ti;
	 this.times=time;
 }
 public Cuns(String ti,String con){
	 this.title=ti;
	 this.content=con;
 }
public int getIds() {
	return ids;
}
public String getTitle() {
	return title;
}
public String getContent() {
	return content;
}
public String getTimes() {
	return times;
}
 
}
