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