#include "childAnimal.h"

int main()
{
    int option;
    int index = 0;
    Mammal **zoo = new Mammal *[index];
    while (true)
    {
        do
        {
            cout << "Select the animal to send to Zoo :\n(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;
            cin >> option;
        } while (option < 1 || 5 < option);
        if (option == 5)
            break;
        Mammal **tempZoo = new Mammal *[index + 1];
        switch (option)
        {
        case 1:
            tempZoo[index] = new Dog();
            break;
        case 2:
            tempZoo[index] = new Cat();
            break;
        case 3:
            tempZoo[index] = new Lion();
            break;
        case 4:
            if (index == 0)
                cout << "Zoo is empty" << endl;
            else
                for (int i = 0; i < index; i++)
                {
                    zoo[i]->move();
                    zoo[i]->speak();
                    zoo[i]->eat();
                }
                zoo = new Mammal *[0];
                index = 0;
            break;
        }
        if (option != 4)
        {
            for (int i = 0; i < index; i++)
            {
                tempZoo[i] = zoo[i];
            }
            zoo = new Mammal *[index++ + 1];
            zoo = tempZoo;
        }
    }
    cout << "Program exiting..." << endl;
    return 0;
}