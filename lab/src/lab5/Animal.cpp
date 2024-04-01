#include <iostream>
#include <string>

using namespace std;

enum COLOR
{
    Green,
    Blue,
    White,
    Black,
    Brown
};

class Animal
{
public:
    Animal() : _name("unknown")
    {
        cout << "constructing Animal object " << _name << endl;
    }
    Animal(string n, COLOR c) : _name(n), _color(c)
    {
        cout << "constructing Animal object " << _name << endl;
    }
    ~Animal()
    {
        cout << "destructing Animal object " << _name << endl;
    }
    void speak() const
    {
        cout << "Animal speaks " << endl;
    }
    void move() const {}

private:
    string _name;
    COLOR _color;
};

class Mammal : public Animal
{
public:
    Mammal(string n, COLOR c) : Animal(n, c){};
    ~Mammal()
    {
        cout << "destructing Mammal object " << endl;
    }
    void eat() const
    {
        cout << "Mammal eat" << endl;
    }
};

int main()
{
    Mammal a("asd", Black);
    a.speak();
    a.eat();
    cout << "Program exiting …. " << endl;
    return 0;
}