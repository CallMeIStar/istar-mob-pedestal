scoreboard objectives add zombified_piglin_kills dummy

scoreboard players add @s zombified_piglin_kills 1

advancement revoke @s only istars-mob-pedestal:zombified_piglin_kill

execute as @s if score @s zombified_piglin_kills matches 50.. run give @s istars-mob-pedestal:zombified_piglin_soul 1

execute as @s if score @s zombified_piglin_kills matches 50.. run scoreboard players set @s zombified_piglin_kills 0