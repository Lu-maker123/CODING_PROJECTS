#import library
import turtle

#screen of game
back = turtle.Screen()
back.title("Pong Pong")
back.bgcolor("white")
back.setup(width=600, height=600)

#player on left side
lefty = turtle.Turtle()
lefty.speed(0)
lefty.shape("square")
lefty.color("black")
lefty.shapesize(stretch_wid=6, stretch_len=2)
lefty.penup()
lefty.goto(-250, 0)

#player on right side
righty = turtle.Turtle()
righty.speed(0)
righty.shape("square")
righty.color("black")
righty.shapesize(stretch_wid=6, stretch_len=2)
righty.penup()
righty.goto(250, 0)

# Ball of game
ball = turtle.Turtle()
ball.speed(40)
ball.shape("circle")
ball.color("blue")
ball.penup()
ball.goto(0, 0)
ball.dx = 5
ball.dy = -5

# Functions to move paddle vertically
def paddleaup():
    y = lefty.ycor()
    y += 20
    lefty.sety(y)
 
 
def paddleadown():
    y = lefty.ycor()
    y -= 20
    lefty.sety(y)
 
 
def paddlebup():
    y = righty.ycor()
    y += 20
    righty.sety(y)
 
 
def paddlebdown():
    y = righty.ycor()
    y -= 20
    righty.sety(y)

# Keyboard 
back.listen()
back.onkeypress(paddleaup, "w")
back.onkeypress(paddleadown, "s")
back.onkeypress(paddlebup, "Up")
back.onkeypress(paddlebdown, "Down")

#funcion for ball to move around
while True:
    back.update()

    ball.setx(ball.xcor() + ball.dx)
    ball.sety(ball.ycor() + ball.dy)

    # Check if ball hits edge of borders
    if ball.ycor() > 280:
        ball.sety(280)
        ball.dy *= -1
 
    if ball.ycor() < -280:
        ball.sety(-280)
        ball.dy *= -1

    if ball.xcor() > 500:
        ball.goto(0, 0)
        ball.dy *= -1

    if ball.xcor() < -500:
        ball.goto(0, 0)
        ball.dy *= -1
    
    # Paddle ball collision
    if (ball.xcor() > righty.xcor() - 10 and
        ball.xcor() < righty.xcor() + 10) and \
    (ball.ycor() < righty.ycor() + 50 and
        ball.ycor() > righty.ycor() - 50):
        ball.setx(righty.xcor() - 10)  # Adjust position to avoid sticking
        ball.dx *= -1

    if (ball.xcor() < lefty.xcor() + 10 and
        ball.xcor() > lefty.xcor() - 10) and \
    (ball.ycor() < lefty.ycor() + 50 and
        ball.ycor() > lefty.ycor() - 50):
        ball.setx(lefty.xcor() + 10)  # Adjust position to avoid sticking
        ball.dx *= -1


