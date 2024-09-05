scoreboard objectives add ghast_kills dummy

scoreboard players add @s ghast_kills 1

advancement revoke @s only istars-mob-pedestal:ghast_kill

execute as @s if score @s ghast_kills matches 50.. run give @s istars-mob-pedestal:ghast_soul 1

execute as @s if score @s ghast_kills matches 50.. run scoreboard players set @s ghast_kills 0