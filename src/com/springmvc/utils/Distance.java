package com.springmvc.utils;

public class Distance {
	 private static final double EARTH_RADIUS = 6378.137;
	 private static final double TimeOfOneKilo=20.0;
	 private static final double PriceOfOneKilo=2.0;
	 
	  private static double rad(double d){
	      return d * Math.PI / 180.0;
	  }
	 
	  public static double GetDistance(double long1, double lat1, double long2, double lat2) {
	      double a, b, d, sa2, sb2;
	      lat1 = rad(lat1);
	      lat2 = rad(lat2);
	      a = lat1 - lat2;
	      b = rad(long1 - long2);
	 
	      sa2 = Math.sin(a / 2.0);
	      sb2 = Math.sin(b / 2.0);
	      d = 2   * EARTH_RADIUS
	              * Math.asin(Math.sqrt(sa2 * sa2 + Math.cos(lat1)
	              * Math.cos(lat2) * sb2 * sb2));
	      return d;
	  }
	  public static String getAverageTime(double dis){
		  String s="39.0";
//		  if(Double.valueOf(dis).compareTo(0.0)>0){
//			  double time=20.0+TimeOfOneKilo*Double.valueOf(dis);
//			  s=String.valueOf(time);
//		  }
		  return s;
	  }
	  public static double getDeliveryPrice(double dis){
		  return 5.5d;
		 // return PriceOfOneKilo*dis;
	  }
}
