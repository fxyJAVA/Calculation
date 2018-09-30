# Calculation
开发环境为jdk1.8，开发工具为intellij idea，可执行程序为Myapp.exe  
执行操作为：在windows cmd下根据需要实现的功能输入相应的参数：  
1）生成题目的命令：Myapp.exe -n num -r size  
其中num为题数，size为生成数的大小  
如：Myapp.exe -n 100 -r 10  
2）判断答案是否正确的命令：Myapp.exe -e exercisefile.txt -a answerfile.txt    
判断答案的正确率，其中exercisefile.txt为生成练习题的路径 、answerfile.txt为答案的路径  
如：Myapp.exe -e D:\\\\Exercises@2018-09-29_20-40-16.txt -a D:\\\\MyAnswer.txt

默认生成题目和答案的文档的路径为D：\\\\
