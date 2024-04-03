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
    virtual void speak()
    {
        cout << "Animal speaks " << endl;
    }
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
    string owner;

public:
    Dog(string n, COLOR c, string o) : Mammal(n, c), _name(n), _color(c), owner(o) {}
    ~Dog() { cout << "destructing Dog object " << _name << endl; }
    void speak() { cout << "Woof" << endl; }
    void move() { cout << "Dog runs" << endl; }
};

class Cat : public Mammal
{
private:
    string _name;
    COLOR _color;

public:
    Cat(string n, COLOR c) : Mammal(n, c), _name(n), _color(c) {}
    ~Cat() { cout << "destructing Cat object " << _name << endl; }
    void speak() { cout << "Meow" << endl; }
    void move() { cout << "Cat runs" << endl; }
};

class Lion : public Mammal
{
private:
    string _name;
    COLOR _color;

public:
    Lion(string n, COLOR c) : Mammal(n, c), _name(n), _color(c) {}
    ~Lion() { cout << "destructing Lion object " << _name << endl; }
    void speak() { cout << "Giao" << endl; }
    void move() { cout << "Lion runs" << endl; }
};

int main()
{
    // Dog dog("Lassie", White, "Andy");
    // Mammal *aniPtr = &dog;
    // Mammal &aniRef = dog;
    // Mammal aniVal = dog;
    // aniPtr->speak();
    // aniRef.speak();
    // aniVal.speak();
    Mammal *zoo = new Mammal[3];
    int option;
    do
    {
        cout << "Select the animal to send to Zoo :\n(1) Dog\n(2) Cat\n(3) Lion\n(4) Move all animals\n(5) Quit" << endl;
        cin >> option;
    } while (option < 1 || 5 < option);
    switch (option)
    {
    case 1:
        Dog dog("A dog", White, "Andy");
        zoo[0] = dog;
        zoo[0].speak();
        break;
    // case 2:
        
    }
}