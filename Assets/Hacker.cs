using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Hacker : MonoBehaviour {
    //Class attributes
    //These arrays will hold the passwords of the differente games lavels
    const string menuHint = "You can Type menu any time";
    string[] passwordLevel1 = { "book", "class", "teacher", "room", "hour" };
    string[] passwordLevel2 = { "cashier", "department", "payment", "electronics" };
    string[] passwordLevel3 = { "dossier", "ineternational", "security", };
    string[] codes1 = { "book","class","teacher","room","hour" };

    //here i declare an enumerated type to represente the different game 
    //states, and I declare a variable to hold the corrent game state
    int level;
    int position;
    string password;
    string code;
    bool ingame = false;
    enum gameState { MainMenu, Password,Win};
    gameState currentScreen= gameState.MainMenu;
    string input;

    // Use this for initialization
    void Start()
    {

        ShowMainMenu();
    }	// Update is called once per frame
	void Update () {
		
	}
    public void ShowMainMenu() {
        Terminal.ClearScreen();
        currentScreen = gameState.MainMenu;
            Terminal.ClearScreen();
            Terminal.WriteLine("What do you want to hack today");
            Terminal.WriteLine("1.-Town's college");
            Terminal.WriteLine("2.-Market");
            Terminal.WriteLine("3.-NSA Server");
            Terminal.WriteLine("Option?");

            

        }
    void OnUserInput(string input)
    {
        //si el usuario teclea la palabra menu entonces lo manda al main menu
        if(input == "menu")
        {
            ShowMainMenu();
        }
        // el juego se tiene que cerrar
        // si esta en web no funciona el comando asi que le pedimos que cierre la tab
        else if (input == "quit" || input =="exit" || input == "close")
        {
            Terminal.WriteLine("please close the tab");
            Application.Quit(); 
        }
        // if there is a different input
        // then we are goin to handle that input depending
        if(currentScreen== gameState.MainMenu)
        {
            RunMainmenu();
        
        }
        // But if the curreng game state is Passwoed then we call Check Password
        else if(currentScreen == gameState.Password)
        {
            CheckPassword(input);
        }
    }

    private void CheckPassword(string input)
    {
        if (input == code)
        {
            DisplayWinScreen();

        }
        else
        {
            AskForPassword();
        }
    }

    private void DisplayWinScreen()
    {
        ingame = false;
        Terminal.ClearScreen();
        ShowLevelReward();
        Terminal.WriteLine(menuHint);
    }

    private void ShowLevelReward()
    {
        switch (level)
        {
            case 1:
                Terminal.WriteLine("Heating up things don't ya ");
                break;
            case 2:
                Terminal.WriteLine("Burning bush");
                break;
            case 3:
                Terminal.WriteLine("Congratularions Son");
                break;
            default:
                Debug.LogError("Enter a a correcth thing son.");
                break;
        }
    }

    private void RunMainmenu()
    {
        bool isValidInput = (input=="1")||(input=="2")||(input=="3");
        // if the user inputs a valid level, we convert that input into an int value and then we call the AskForPassword() method.
        if (isValidInput)
        {
            level = int.Parse(input);
            AskForPassword();
        }
        //if the level isnt valid then we are gona check the Easter Egg
        if (input == "Phantom")
        {
            Terminal.WriteLine("Snake... why are we still here? Just to suffer? Every night, I can feel my leg and my arm... " +
                "even my fingers... the body I've lost... the comrades I've lost... won't stop hurting. " +
                "It's like they're all still there. You feel it too, don't you? I'm the one who got caught up with Cipher. " +
                "A group above nations... even the US. And I was the parasite below, feeding off Zero's power. " +
                "They came after you in Cyprus... then Afghanistan... Cipher... just keeps growing. Swallowing everything in it's path. " +
                "Getting bigger and bigger... Who knows how big now? Boss. I'm gonna make 'em give back our past... " +
                "take back everything that we've lost. And I won't rest... until we do.");

            Terminal.WriteLine("Snake : Enter a Valid Level");
        }
        else
        {
            Terminal.WriteLine("Enter a Valid Level");
        }

    }

    private void AskForPassword()
    {
        currentScreen = gameState.Password;

        Terminal.ClearScreen();

        SetRandomPassword();

        Terminal.WriteLine("enter your password. Hint:" + password.Anagram());
        Terminal.WriteLine(menuHint);
    }

    private void SetRandomPassword()
    {
        switch (level)
        {
            case 1:
                password = passwordLevel1[UnityEngine.Random.Range(0, passwordLevel1.Length)];
                position = SearchPosition(password, passwordLevel1);
                code = codes1[position];
                break;
            case 2:
                password = passwordLevel2[UnityEngine.Random.Range(0, passwordLevel2.Length)];
                position = SearchPosition(password, passwordLevel1);
                code = codes1[position];
                break;
            case 3:
                password = passwordLevel3[UnityEngine.Random.Range(0, passwordLevel3.Length)];
                position = SearchPosition(password, passwordLevel1);
                code = codes1[position];
                break;
            default:
                Debug.LogError("Invalid Level. How did you manage that?");
                break;

        }
    }
    private int SearchPosition(string password, string[] levelPasswords)
    {
        for (int i = 0; i < levelPasswords.Length; i++)
        { 
            if (levelPasswords[i] == password)
            { 
                return i;
            }
        }
        Terminal.WriteLine("Mistake");
        return -1;
    }

}

