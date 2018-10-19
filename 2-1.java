/*
第1关：气温预测100
过关任务
参考答案
评论11
挑战任务
根据每日气温数组，请重新生成一个数组，新数组对应位置的是你需要再等待多久温度才会升高的天数。如果之后都不会升高，请用0来代替。

例如：给定一个数组 temps = {34,35,33,25,44,19,18,17} 新生成的数组应该为[1, 3, 2, 1, 0, 0, 0, 0]。

temps数组第一天温度是34℃，第二天是35℃，所以对应新生成数组位置的数据应该是1，代表还需等待1天就会升温，第二天温度是35℃，还需等待3天才会出现比35℃还高的温度（44℃），第五天温度是44℃，之后都不会升温了，则用0来代替。

编程要求
补充完善右侧代码区中的dailyTemps(Integer[] temps)函数，实现，最后返回计算的结果即可。

注意：气温 列表长度的范围是 [1, 10000]。每个气温的值的都是 [0, 100]范围内的整数。

测试说明
样例1
输入：

34 35 33 25 44 45 46 17

输出：

[1, 3, 2, 1, 1, 1, 0, 0]
*/
package step1;

public class Task {
	public  int[] dailyTemps(Integer[] temperatures){
		/********** BEGIN **********/
        int[] result = new int[temperatures.length];
		for(int i=0;i<temperatures.length;i++){
            Integer temp = temperatures[i];
			for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[j]>temp){
                    result[i] = j-i;
                    break;
                }
            }
        }

		return result;
		/********** END **********/
	}
}
