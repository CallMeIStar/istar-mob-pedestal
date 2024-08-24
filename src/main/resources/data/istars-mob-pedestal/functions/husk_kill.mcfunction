scoreboard objectives add husk_kills dummy

scoreboard players add @s husk_kills 1

advancement revoke @s only istars-mob-pedestal:husk_kill

execute as @s if score @s husk_kills matches 50.. run give @s istars-mob-pedestal:husk_soul 1

execute as @s if score @s husk_kills matches 50.. run scoreboard players set @s husk_kills 0