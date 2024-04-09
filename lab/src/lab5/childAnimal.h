#include "animal.h"

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