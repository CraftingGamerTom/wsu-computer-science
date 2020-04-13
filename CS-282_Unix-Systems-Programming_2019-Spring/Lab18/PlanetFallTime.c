#include <stdio.h>
#include <math.h>
#include <string.h>
#include "globals.h"

int main()
{
    float height, fall_time;
    char planet[10];
    printf("\nEnter height in meters from which object falls: ");
    scanf("%f",&height);
    fflush(stdin);
    printf("\nEnter Planet: ");
    scanf("%s",planet);
    fflush(stdin);
    if(strcmp(planet,"Mercury") == 0)
    {
        fall_time = sqrt(2*height/MERCURY_g);
    }
    if(strcmp(planet,"Venus") == 0)
        {
        fall_time = sqrt(2*height/VENUS_g);
    }
    if(strcmp(planet,"Earth") == 0)
    {
        fall_time = sqrt(2*height/EARTH_g);
    }
    if(strcmp(planet,"Mars") == 0)
    {
        fall_time = sqrt(2*height/MARS_g);
    }
    if(strcmp(planet,"Jupiter") == 0)
    {
        fall_time = sqrt(2*height/JUPITER_g);
    }
    if(strcmp(planet,"Saturn") == 0)
    {
        fall_time = sqrt(2*height/SATURN_g);
    }
    if(strcmp(planet,"Uranus") == 0)
    {
        fall_time = sqrt(2*height/URANUS_g);
    }
    if(strcmp(planet,"Neptune") == 0)
    {
        fall_time = sqrt(2*height/NEPTUNE_g);
    }
    printf("\n Fall time on planet %s is %.4f m/s^2.\n", planet, fall_time);
    return 0;
}
