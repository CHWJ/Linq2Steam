using System;
using System.Linq;

namespace LINQSamples
{
    class Aggregate
    {
        public static void Run()
        {
            var numbers = new int[] { 1, 2, 3, 4, 5 };

            var result = numbers.Aggregate((a, b) => a + b);
            Console.WriteLine(result);

            result = numbers.Aggregate((a, b) => a * b);
            Console.WriteLine(result);
        }
    }
}
