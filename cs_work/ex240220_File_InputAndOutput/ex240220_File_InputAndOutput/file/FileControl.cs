using System;
using System.Collections.Generic;
using System.IO;

namespace ex240220_File_InputAndOutput.file
{
    internal class FileControl
    {
        string filePath = "data.txt";

        public void write(string text, List<string> list)
        {
            //Console.WriteLine($"textBox로 적은 값 >>> {text}" );

            // text 값을 파일 내에 저장하기 위함 ( 하나의 값 )
            //File.WriteAllText(filePath, text);

            // 여러개 값을 파일 내에 저장하기
            foreach(var item in list)
            {
                Console.WriteLine(item);
            }
            File.WriteAllLines(filePath, list);
        }
        public List<string> read()
        {
            //Console.WriteLine("read");
            List<string> list = new List<string>(File.ReadAllLines(filePath));
            return list;
        }
    }
}
