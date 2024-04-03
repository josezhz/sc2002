#include "animal.h"
#include "childAnimal.h"

int main()
{
    Dog dog = new Dog("Lassie", White, "Andy");
    Mammal *aniPtr = &dog;
    Mammal &aniRef = dog;
    Mammal aniVal = dog;
    aniPtr->speak();
    aniRef.speak();
    aniVal.speak();
    // int option;
    // do
    // {
    //     cout << "Select the animal to send to Zoo :\n(1) Dog\n(2) Cat\n(3) Lion\n(4) Move all animals\n(5) Quit" << endl;
    //     cin >> option;
    // } while (option < 1 || 5 < option);
    // switch (option)
    // {
    // case 1:
    // }
}