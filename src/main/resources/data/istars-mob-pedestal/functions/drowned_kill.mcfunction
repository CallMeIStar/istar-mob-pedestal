scoreboard objectives add drowned_kills dummy

scoreboard players add @s drowned_kills 1

advancement revoke @s only istars-mob-pedestal:drowned_kill

execute as @s if score @s drowned_kills matches 50.. run give @s istars-mob-pedestal:drowned_soul 1

execute as @s if score @s drowned_kills matches 50.. run scoreboard players set @s drowned_kills 0