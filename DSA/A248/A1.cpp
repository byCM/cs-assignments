#include <iostream>
#include <math.h>

using namespace std;

void countSet(unsigned long long decimalnum)
{
    unsigned long long binarynum = 0, temp = 1, num;
    int rem;
    num = decimalnum;
    int i = 0, set = 0;
    int arr[32];

    while (i < 32)
    {
        rem = decimalnum % 2;
        decimalnum = decimalnum / 2;
        temp = temp * 10;
        arr[i] = rem;
        i++;
        if (rem == 1)
            set++;
    }

    cout << endl << "The binary representation is: ";
    {
        for (int i = 31; i >= 0; i--)
            cout << arr[i];
    }
    cout << endl << endl << "There are exactly " << set << " bits set in the value " << num;
}


int main()
{
    long long num;

    cout << "Enter a decimal integer value: ";
    cin >> num;

    countSet(num);

    return 0;
}
