#include "animal.h"

Animal::Animal() : _name("unknown") { cout << "constructing Animal object " << _name << endl; }
Animal::Animal(string n, COLOR c) : _name(n), _color(c) { cout << "constructing Animal object " << _name << endl; }
Animal::~Animal() { cout << "destructing Animal object " << _name << endl; }
virtual void Animal::speak() { cout << "Animal speaks " << endl; }
virtual void Animal::move() = 0;
virtual void Animal::eat() = 0;