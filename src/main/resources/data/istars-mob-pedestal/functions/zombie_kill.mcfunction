scoreboard objectives add zombie_kills dummy

scoreboard players add @s zombie_kills 1

advancement revoke @s only istars-mob-pedestal:zombie_kill

execute as @s if score @s zombie_kills matches 50.. run give @s istars-mob-pedestal:zombie_soul 1

execute as @s if score @s zombie_kills matches 50.. run scoreboard players set @s zombie_kills 0