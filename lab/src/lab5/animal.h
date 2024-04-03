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
    Animal();
    Animal(string n, COLOR c);
    ~Animal();
    virtual void speak();
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
    Mammal(string n, COLOR c) : Animal(n, c), _name(n), _color(c){};
    ~Mammal() {}
    void move() {};
    void eat() {}
};