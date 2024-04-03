#include "animal.h"

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