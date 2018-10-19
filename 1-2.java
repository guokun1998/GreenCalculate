/*
第2关：文件查看器100

挑战任务
参加“绿盟杯”竞赛的小红遇到一个问题，她想要编写代码实现一个文件查看器，要实现指定文件夹下所有文件以及文件夹目录结构的展示。

你来帮她实现这个功能吧。

编程要求
编写代码实现对给定文件夹目录结构的展示，如果是文件夹则在其名字之前加上+--若是文件则加上--，上级目录与下级目录、下级文件用两个空格作为间隔，同级下依照文件夹、文件的首字母顺序依次打印；补充完善右侧代码区中的showDirStructure(File dir)函数实现要求的功能，其中函数参数含义如下：

dir：指定要显示的文件夹
测试说明
样例1
输入：src/step2/root

输出：

+--root
  +--ccf
    --a.txt
    --b.txt
  +--educoder
    +--edycider.net
      --a.txt
      --b.txt
  +--gcc
    --a.txt
    --b.txt
    --新建 Microsoft Word 文档.docx
*/
package step2;

import java.io.File;

public class Task {
	
	/********** BEGIN **********/
    
	static String doubleBlank = "  ";
    static String flag1 = "+--";
    static String flag2 = "--";
    public void showDirStructure(File file)	{
		printName(file,0);
	}
    public static void printName(File file,int deep){
   		for(int i=0;i<deep;i++){
            System.out.print(doubleBlank);
        }
        if(file.isDirectory()){
            System.out.print(flag1);
            System.out.println(file.getName());
            for(File f:file.listFiles()){
                printName(f,deep+1);
            }
        }
        else if(file.isFile()){
            System.out.print(flag2);
            System.out.println(file.getName());
        }
    }
	


	/********** END **********/
}
