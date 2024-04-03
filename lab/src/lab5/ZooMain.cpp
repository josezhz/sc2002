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
    Animal() : _name("unknown") { cout << "constructing Animal object " << _name << endl; }
    Animal(string n, COLOR c) : _name(n), _color(c) { cout << "constructing Animal object " << _name << endl; }
    ~Animal() { cout << "destructing Animal object " << _name << endl; }
    virtual void speak() = 0;
    virtual void move() = 0;
    virtual void eat() = 0;

private:
    string _name;
    COLOR _color;
};

class Mammal : public Animal
{
private:
    string _name;
    COLOR _color;

public:
    Mammal() : Animal() {}
    Mammal(string n, COLOR c) : Animal(n, c), _name(n), _color(c) {}
    ~Mammal() { cout << "destructing Mammal object " << _name << endl; }
    void speak() { cout << "Mammal speaks " << endl; }
    void move() { cout << "Mammal moves" << endl; }
    void eat() { cout << "Mammal eats" << endl; }
};

class Dog : public Mammal
{
private:
    string _name;
    COLOR _color;
    string _owner;

public:
    Dog() : Mammal(), _owner("unknown") {}
    Dog(string n, COLOR c, string o) : Mammal(n, c), _name(n), _color(c), _owner(o) {}
    ~Dog() { cout << "destructing Dog object " << _name << endl; }
    void speak() { cout << "Dog WOOF" << endl; }
    void move() { cout << "Dog runs" << endl; }
    void eat() { cout << "Dog eats" << endl; }
};

class Cat : public Mammal
{
private:
    string _name;
    COLOR _color;

public:
    Cat() : Mammal() {}
    Cat(string n, COLOR c) : Mammal(n, c), _name(n), _color(c) {}
    ~Cat() { cout << "destructing Cat object " << _name << endl; }
    void speak() { cout << "Cat MEOW" << endl; }
    void move() { cout << "Cat runs" << endl; }
    void eat() { cout << "Cat eats" << endl; }
};

class Lion : public Mammal
{
private:
    string _name;
    COLOR _color;

public:
    Lion() : Mammal() {}
    Lion(string n, COLOR c) : Mammal(n, c), _name(n), _color(c) {}
    ~Lion() { cout << "destructing Lion object " << _name << endl; }
    void speak() { cout << "Lion GIAO" << endl; }
    void move() { cout << "Lion runs" << endl; }
    void eat() { cout << "Lion eats" << endl; }
};

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