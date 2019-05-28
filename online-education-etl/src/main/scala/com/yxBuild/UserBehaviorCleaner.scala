package com.yxBuild

/**
  *
  * 用户行为数据清洗
  * 1、验证数据格式是否正确，切分后长度必须为17
  * 2、手机号脱敏，格式为123xxxx4567
  * 3、去掉username中带有的\n，否则导致写入HDFS时会换行
  */
object UserBehaviorCleaner {
  def main(args: Array[String]): Unit = {
    // 判断参数长度是否为2
    if(args.length != 2){
      println("Usage:please input inputPath and outputPath")
      System.exit(1)
    }

    // 获取输入和输出目录
    val inputPath = args(0)
    val outputPath = args(1)

  }
}
