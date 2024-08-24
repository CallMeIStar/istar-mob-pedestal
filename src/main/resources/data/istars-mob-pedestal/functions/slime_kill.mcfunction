scoreboard objectives add slime_kills dummy

scoreboard players add @s slime_kills 1

advancement revoke @s only istars-mob-pedestal:slime_kill

execute as @s if score @s slime_kills matches 50.. run give @s istars-mob-pedestal:slime_soul 1

execute as @s if score @s slime_kills matches 50.. run scoreboard players set @s slime_kills 0