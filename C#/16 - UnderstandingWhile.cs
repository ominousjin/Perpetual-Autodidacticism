using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace App1
{
    class Program
    {   
        static void Main(string[] args)
        {
            // A while loop repeatedly executes a set of instructions as long as a specified condition is true.
            int i = 0;

            while (i < 5) // Accepted parameters are only boolean values
            {
                Console.WriteLine("Test Succeeded");
                i++; // Increment operator increments the value of variable until the specified condition becomes false.
            }

            Console.ReadLine();
        }
    }
}
