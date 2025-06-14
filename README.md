# Rock-Paper-Scissor Game

A simple command-line **Rock-Paper-Scissor** game written in **Java**, where a user plays against the computer. The game continues in a loop until the user decides to exit.

## Tech Stack

- **Language:** Java (OpenJDK 21)
- **IDE:** IntelliJ IDEA (or any preferred Java IDE)
- **Tools:** Java Standard Libraries (`java.util.Scanner`, `java.util.Random`)

## Features

- Interactive CLI gameplay.
- Computer opponent with random choice generation.
- Input validation with error prompts.
- Option to replay after each round.

## How to Run

### Prerequisites

- Java 21 installed and configured in your system.
- IntelliJ IDEA (or any other Java IDE) OR terminal access with Java compiler.

### Steps

1. **Clone this repository**
   ```bash
   git clone https://github.com/your-username/rock-paper-scissor.git
   cd rock-paper-scissor
   ```

2. **Open the project in IntelliJ IDEA**
   - Open IntelliJ IDEA.
   - Click on **File > Open...**
   - Navigate to the folder you cloned.
   - Select the folder and click **OK**.
   - IntelliJ will index the project and you can run `rockPaperScissor.java` from the editor.

3. **Or compile and run from terminal**
   ```bash
   javac rockPaperScissor.java
   java rockPaperScissor
   ```

4. **Follow the prompts** to play the game in your terminal.

## Gameplay

- Choose from: `rock`, `paper`, or `scissor`.
- The computer randomly picks a choice.
- Win/Lose/Tie is determined based on classic rules.
- Replay option after every round.

## File Structure

```
rock-paper-scissor/
│
├── rockPaperScissor.java    # Main program file
└── README.md                # Project documentation
```

## License

This project is open-source and available under the [MIT License](LICENSE).
