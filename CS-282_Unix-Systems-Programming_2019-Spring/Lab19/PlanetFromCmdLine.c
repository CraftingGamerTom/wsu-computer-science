#include <stdio.h>
#include <string.h>
#define NPLANETS 8

void PlanetFallTime(char *);
int main(int argc, char *argv[])
{
    char *planets[] = { "Mercury", "Venus", "Earth",
                        "Mars", "Jupiter", "Saturn",
                        "Uranus", "Neptune"};

    for(int i = 1; i < argc; i++)
    {
        int j;
        for(j =0; j<NPLANETS; j++)
        {
            if(strcmp(argv[i], planets[j]) == 0)
            {
                printf("%s is Planet No. %d\n", argv[i], j+1);
                PlanetFallTime(argv[i]);
                break;
            }
        }
        if (j == NPLANETS)
                        printf("%s is not a planet.\n", argv[i]);
    }
    return 0;
}