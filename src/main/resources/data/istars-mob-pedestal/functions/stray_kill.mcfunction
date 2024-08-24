scoreboard objectives add stray_kills dummy

scoreboard players add @s stray_kills 1

advancement revoke @s only istars-mob-pedestal:stray_kill

execute as @s if score @s stray_kills matches 50.. run give @s istars-mob-pedestal:stray_soul 1

execute as @s if score @s stray_kills matches 50.. run scoreboard players set @s stray_kills 0