using System;
using System.Linq;

namespace LINQSamples
{
    class Aggregate
    {
        private static readonly int[] Numbers = new int[] {1, 2, 3, 4, 5};

        public static void Run()
        {
            SampleAggregateLambdaSimple();

            SampleAggregateLambdaSeed();

            SampleAverageLambda();

            SampleCountLambda();

            SampleMaxLambda();

            SampleMinLambda();

            SampleSumLambda();
        }

        private static void SampleAggregateLambdaSimple()
        {
            var result = Numbers.Aggregate((a, b) => a + b);
            // 15
            Console.WriteLine(result);

            result = Numbers.Aggregate((a, b) => a * b);
            // 120
            Console.WriteLine(result);
        }

        private static void SampleAggregateLambdaSeed()
        {
            var result = Numbers.Aggregate(10, (a, b) => a + b);
            // 25
            Console.WriteLine(result);
        }

        private static void SampleAverageLambda()
        {
            var result = Numbers.Average();
            // 3
            Console.WriteLine(result);
        }

        private static void SampleCountLambda()
        {
            var result = Numbers.Count();
            // 5
            Console.WriteLine(result);
        }

        private static void SampleMaxLambda()
        {
            var result = Numbers.Max();
            // 5
            Console.WriteLine(result);
        }

        private static void SampleMinLambda()
        {
            var result = Numbers.Min();
            // 1
            Console.WriteLine(result);
        }

        private static void SampleSumLambda()
        {
            var result = Numbers.Sum();
            // 15
            Console.WriteLine(result);
        }
    }
}
